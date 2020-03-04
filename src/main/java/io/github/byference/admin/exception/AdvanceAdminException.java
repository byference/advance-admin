package io.github.byference.admin.exception;

import io.github.byference.admin.constant.EnumVisitor;

/**
 * AdvanceAdminException
 *
 * @author byference
 * @since 2020-03-04
 */
public class AdvanceAdminException extends RuntimeException {

    private static final long serialVersionUID = -3089087279278959393L;

    public AdvanceAdminException() {
    }

    public AdvanceAdminException(String message) {
        super(message);
    }

    public AdvanceAdminException(String message, Throwable cause) {
        super(message, cause);
    }

    public AdvanceAdminException(Throwable cause) {
        super(cause);
    }

    public AdvanceAdminException(EnumVisitor<Integer> enumVisitor) {
        super(String.format("%s [%s]", enumVisitor.getDescription(), enumVisitor.getCode()));
    }

    public AdvanceAdminException(EnumVisitor<Integer> enumVisitor, Throwable cause) {
        super(String.format("%s [%s]", enumVisitor.getDescription(), enumVisitor.getCode()), cause);
    }
}
