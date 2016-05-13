package perinfo;

import java.util.List;


public interface IperinfoDAO {
	public abstract List<person> findAll() throws Exception;
	public abstract person find(person per1) throws Exception; 
}
