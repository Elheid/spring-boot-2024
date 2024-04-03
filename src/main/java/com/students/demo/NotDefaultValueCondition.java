package com.students.demo;

import com.fasterxml.jackson.databind.introspect.Annotated;
import lombok.NonNull;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class NotDefaultValueCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, @NonNull AnnotatedTypeMetadata metadata) {
        String condition = "default";
        String variable = "myapp.environment-variable";
        String myPropertyValue = context.getEnvironment().getProperty(variable, condition);
        return !condition.equals(myPropertyValue);
    }
}