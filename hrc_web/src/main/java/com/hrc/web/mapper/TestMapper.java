package com.hrc.web.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TestMapper {

	@Select("SELECT * FROM RUNNERS")
	List<HashMap<String, Object>> selectAll();

}
