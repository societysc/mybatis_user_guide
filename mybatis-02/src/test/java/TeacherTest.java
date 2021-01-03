import com.staticzz.dao.TeacherDao;
import com.staticzz.entity.Teacher;
import com.staticzz.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;

public class TeacherTest {

    /**
     * 测试根据结果嵌套查询
     * @throws IOException
     */
    @Test
    public  void  test() throws IOException {
        MybatisUtils mybatisUtils = new MybatisUtils();

        SqlSession sqlSession = mybatisUtils.sqlSession();

        TeacherDao mapper = sqlSession.getMapper(TeacherDao.class);

        for (Teacher teacher : mapper.teachers(2)) {
            System.out.println(teacher);
        }

        sqlSession.close();

    }

    /**
     * 测试根据查询嵌套查询
     * @throws IOException
     */
    @Test
    public  void  test1() throws IOException {
        MybatisUtils mybatisUtils = new MybatisUtils();

        SqlSession sqlSession = mybatisUtils.sqlSession();

        TeacherDao mapper = sqlSession.getMapper(TeacherDao.class);

        for (Teacher teacher : mapper.teachers2(1)) {
            System.out.println(teacher);
        }

        sqlSession.close();

    }



}
