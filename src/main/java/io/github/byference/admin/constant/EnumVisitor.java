package io.github.byference.admin.constant;

/**
 * EnumVisitor
 *
 * @author byference
 * @since 2020-03-02
 */
public interface EnumVisitor<T> {

    T getCode();

    String getDescription();
}
