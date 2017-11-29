package net.java.scrapy.pool;

public interface ProxyPool<T> {
	public void init();
	public T getPool ();
	public boolean close(T pool);
}
