package org.jqassistant.contrib.plugin.javagen.api.model;

import com.buschmais.jqassistant.core.store.api.model.FullQualifiedNameDescriptor;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation.Incoming;
import com.buschmais.xo.neo4j.api.annotation.Relation.Outgoing;
import org.checkerframework.checker.signature.qual.FieldDescriptor;

import java.util.List;
import java.util.Set;

/**
 * Describes a Java type.
 */
@Label(value = "Type", usingIndexedPropertyOf = FullQualifiedNameDescriptor.class)
public interface TypeDescriptor extends JavaSourceCodeDescriptor, PackageMemberDescriptor {

}
