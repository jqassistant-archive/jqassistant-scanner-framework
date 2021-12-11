package org.jqassistant.contrib.plugin.antlr2jqassistant.model;

import com.github.javaparser.ast.CompilationUnit;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class ModelDto {
    @NonNull
    private final CompilationUnit compilationUnit;

    private List<FormattedName> explicitNameMapping = new ArrayList<>();

    @Nullable
    private FormattedName extendsModel;
}
