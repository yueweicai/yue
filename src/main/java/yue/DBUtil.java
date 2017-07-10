package yue;
import java.io.IOException;
import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
public class DBUtil {
	//main
	public static void main(String[] args) throws IOException {
		Reader r = Resources.getResourceAsReader("Configuration.xml");
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		SqlSessionFactory factory = builder.build(r);
		SqlSession session = factory.openSession();
		session.selectList("com.orilore.dao.IProductDAO.select");
	}

}
