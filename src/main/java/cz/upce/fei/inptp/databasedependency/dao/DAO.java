package cz.upce.fei.inptp.databasedependency.dao;

/**
 * Database access object
 * @param <T> Database object type
 */
public interface DAO<T> {

    public void save(T object);
    public T load(String parameters);
    
}
