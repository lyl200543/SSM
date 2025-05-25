package com.lyl.mybatis.test;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lyl.mybatis.mapper.CarMapper;
import com.lyl.mybatis.pojo.Car;
import com.lyl.mybatis.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 *ClassName: CarMapperTest
 *Package: com.lyl.mybatis.test
 *Description:创建于 2025/5/24 13:17
 *@Author lyl
 *@Version 1.0
 */
public class CarMapperTest {

    @Test
    public void testSelectByPageHelper () {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        CarMapper mapper = sqlSession.getMapper(CarMapper.class);

        //在查询语句之前开启分⻚功能
        PageHelper.startPage(2 , 3);

        List<Car> cars = mapper.selectAll();
        //cars.forEach(car -> System.out.println(car));

        //在查询语句之后封装PageInfo对象
        //（PageInfo对象将来会存储到request域当中。在⻚⾯上展示）
        //navigatePages:导航栏显示的页码数量（即分页条中当前页前后最多显示的页码按钮数
        PageInfo<Car> pageInfo = new PageInfo<>(cars,2);
        System.out.println(pageInfo);
        //PageInfo{pageNum=2, pageSize=3, size=3, startRow=4, endRow=6, total=6,
        // pages=2, list=Page{count=true, pageNum=2, pageSize=3, startRow=3,
        // endRow=6, total=6, pages=2, reasonable=false, pageSizeZero=false}
        // [Car{id=73, carNum='404', brand='保时捷', guidePrice=666.00, produceTime='2005-04-30', carType='燃油车'},
        // Car{id=74, carNum='2001', brand='兰博基尼', guidePrice=100.00, produceTime='1998-10-11', carType='燃油⻋'},
        // Car{id=75, carNum='2002', brand='兰博基尼', guidePrice=100.00, produceTime='1998-10-11', carType='燃油⻋'}],
        // prePage=1, nextPage=0, isFirstPage=false, isLastPage=true,
        // hasPreviousPage=true, hasNextPage=false, navigatePages=2,
        // navigateFirstPage=1, navigateLastPage=2, navigatepageNums=[1, 2]}

        sqlSession.close();
    }

    @Test
    public void testSelectByLimit () {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        CarMapper mapper = sqlSession.getMapper(CarMapper.class);
        //前端传入数据，第一页，每页多少条记录
        int pageNum = 2;
        int pageSize = 3;
        int startIndex = (pageNum - 1) * pageSize;

        List<Car> cars = mapper.selectByLimit(startIndex , pageSize);
        cars.forEach(car -> System.out.println(car));

        sqlSession.close();
    }
}
