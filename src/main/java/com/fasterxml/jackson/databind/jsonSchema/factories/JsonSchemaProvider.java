package com.fasterxml.jackson.databind.jsonSchema.factories;

import com.fasterxml.jackson.databind.jsonSchema.types.AnySchema;
import com.fasterxml.jackson.databind.jsonSchema.types.ArraySchema;
import com.fasterxml.jackson.databind.jsonSchema.types.BooleanSchema;
import com.fasterxml.jackson.databind.jsonSchema.types.IntegerSchema;
import com.fasterxml.jackson.databind.jsonSchema.types.NullSchema;
import com.fasterxml.jackson.databind.jsonSchema.types.NumberSchema;
import com.fasterxml.jackson.databind.jsonSchema.types.ObjectSchema;
import com.fasterxml.jackson.databind.jsonSchema.types.StringSchema;

public class JsonSchemaProvider
{
    public AnySchema anySchema() {
        return new AnySchema();
    }

    public ArraySchema arraySchema() {
        return new ArraySchema();
    }

    public BooleanSchema booleanSchema() {
        return new BooleanSchema();
    }

    public IntegerSchema integerSchema() {
        return new IntegerSchema();
    }

    public NullSchema nullSchema() {
        return new NullSchema();
    }

    public NumberSchema numberSchema() {
        return new NumberSchema();
    }

    public ObjectSchema objectSchema() {
        return new ObjectSchema();
    }

    public StringSchema stringSchema() {
        return new StringSchema();
    }
}