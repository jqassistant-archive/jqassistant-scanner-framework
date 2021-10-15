package org.jqassistant.contrib.plugin.javagen.util;

import org.mapstruct.BeforeMapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.TargetType;

import java.util.IdentityHashMap;
import java.util.Map;

public class CycleAvoidingMappingContext {
    private final Map<Object, Object> providesInstances = new IdentityHashMap<Object, Object>();
    private final Map<Object, Object> requiresInstances = new IdentityHashMap<Object, Object>();

    @BeforeMapping
    public <T> T getMappedInstance(Object source, @TargetType Class<T> targetType) {
        return (T) providesInstances.get( source );
    }

    @BeforeMapping
    public void storeMappedInstance(Object source, @MappingTarget Object target) {
        providesInstances.put( source, target );
    }
}
