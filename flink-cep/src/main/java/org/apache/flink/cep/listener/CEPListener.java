package org.apache.flink.cep.listener;

import org.apache.flink.cep.pattern.Pattern;

import java.io.Serializable;

/**
 * Modifications Copyright [2023/07/07] [MRKKmrkk]
 */
public interface CEPListener<T> extends Serializable {

    /**
     * Determine if the pattern has changed
     */
    Boolean isPatternChanged(T element);

    /**
     * This method will be called when isPatternChanged() returns true
     */
    Pattern<T, ?> getPattern(T flagElement);

}
