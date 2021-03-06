package edu.caltech.nanodb.relations;


import edu.caltech.nanodb.server.NanoDBException;


/**
 * This exception is thrown when there are any schema name issues, such as
 * duplicate column names, duplicate table names, ambiguous or invalid names,
 * and so forth.
 **/
public class SchemaNameException extends NanoDBException {

    /**
     * Create a new <code>SchemaNameException</code> with no message or cause.
     */
    public SchemaNameException() {
        super();
    }


    /**
     * Create a new <code>SchemaNameException</code> with the specified message.
     */
    public SchemaNameException(String message) {
        super(message);
    }


    /**
     * Create a new <code>SchemaNameException</code> with the specified cause.
     */
    public SchemaNameException(Throwable cause) {
        super(cause);
    }


    /**
     * Create a new <code>SchemaNameException</code> with the specified message
     * and cause.
     */
    public SchemaNameException(String message, Throwable cause) {
        super(message, cause);
    }
}
