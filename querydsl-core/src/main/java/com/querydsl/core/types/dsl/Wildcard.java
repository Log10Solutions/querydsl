/*
 * Copyright 2011, Mysema Ltd
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.querydsl.core.types.dsl;

import com.querydsl.core.types.Expression;
import com.querydsl.core.types.ExpressionUtils;
import com.querydsl.core.types.Ops;

/**
 * {@code Wildcard} provides constant Expressions for general wildcard expressions
 * 
 * @author tiwe
 *
 */
public final class Wildcard {
    
    /**
     * Wildcard expression (*) for all columns
     */
    public static final Expression<Object[]> all = ExpressionUtils.template(Object[].class, "*");

    /**
     * Wildcard count expression (count(*))
     */
    public static final NumberExpression<Long> count = Expressions.numberOperation(Long.class, Ops.AggOps.COUNT_ALL_AGG);
    
    /**
     * Wildcard count distinct expression (count(distinct *))
     */
    public static final NumberExpression<Long> countDistinct = Expressions.numberOperation(Long.class, Ops.AggOps.COUNT_DISTINCT_ALL_AGG);

    /**
     * Wildcard count expression (count(*))
     */
    public static final NumberExpression<Integer> countAsInt = Expressions.numberOperation(Integer.class, Ops.AggOps.COUNT_ALL_AGG);

    private Wildcard() {}
    
}