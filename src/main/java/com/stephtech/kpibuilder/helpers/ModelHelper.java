package com.stephtech.kpibuilder.helpers;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.metamodel.EntityType;

@Component
public class ModelHelper {
	
	@PersistenceContext
    private EntityManager entityManager;
	
	public List<String> modeles = new ArrayList<>();
	
	public List<String> getAllEntitiesFromProject() {
	    for (EntityType<?> entityType : entityManager.getMetamodel().getEntities()) {
	        if (entityType.getJavaType().isAnnotationPresent(Entity.class)) {
	            Class<?> entityClass = entityType.getJavaType();
	            modeles.add(entityClass.getName());
	        }
	    }
	    return modeles;
	}
	
	public <T> Class<?> getClassFromModelName(String modelName) throws ClassNotFoundException {
		getAllEntitiesFromProject();
	    
	    Class<?> dynamicClass = Class.forName(modeles.stream()
	    		.filter(Objects::nonNull)
	    		.filter(modele -> modele.toLowerCase().contains(modelName.toLowerCase()))
	    		.findFirst()
	    		.get());
	    
	    return dynamicClass;
	}
	
	public SimpleJpaRepository<?, ?> getRepositoryFromClass(Class<?> modelClass) {
	    return new SimpleJpaRepository<>(modelClass.asSubclass(Object.class), entityManager);
	}

}
