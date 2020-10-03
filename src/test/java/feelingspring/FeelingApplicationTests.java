package feelingspring;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.SQLException;

import feelingspring.repository.IngredientRepository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

@SpringBootTest
@Sql({"sql/ddl.sql", "sql/data.sql"})
class FeelingSpringApplicationTests {

	// 注入数据源对象
	@Autowired
	private IngredientRepository inRepo;

	@Test
	public void dataTest() throws SQLException {
		assertEquals(2, inRepo.findAll().size());
	}

}