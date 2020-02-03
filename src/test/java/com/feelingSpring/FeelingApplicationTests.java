package com.feelingSpring;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
class FeelingSpringApplicationTests {

	// 注入数据源对象
	@Autowired
	private DataSource defaultDataSource;

	@Test
	public void datasourceTest() throws SQLException {
		System.out.println("默认数据源为：" + defaultDataSource.getClass());
	}

}