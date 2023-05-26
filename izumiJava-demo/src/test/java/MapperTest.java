import com.izumiJava.RunDemoApplication;
import com.izumiJava.entity.po.UserInfo;
import com.izumiJava.entity.query.UserInfoQuery;
import com.izumiJava.mappers.UserInfoMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@SpringBootTest(classes = RunDemoApplication.class)
@RunWith(SpringRunner.class)
public class MapperTest {
    @Resource
    private UserInfoMapper<UserInfo, UserInfoQuery> userInfoMapper;

    @Test
    public void selectList() {
        // List<UserInfo> dataList = userInfoMapper.selectList(new UserInfoQuery());
        // System.out.println(dataList.size());

        // Long count = userInfoMapper.selectCount(new UserInfoQuery());
        // System.out.println("count:" + count);

        UserInfoQuery userInfoQuery = new UserInfoQuery();
        // userInfoQuery.setUserId("1");
        // userInfoQuery.setJoinTimeStart("2023-05-24");
        userInfoQuery.setEmailFuzzy("1");
        List list = userInfoMapper.selectList(userInfoQuery);
        System.out.println(list.size());
    }

    @Test
    public void insert() {
        UserInfo userInfo = new UserInfo();
        userInfo.setNickName("admin12");
        userInfo.setEmail("admin12");
        userInfo.setJoinTime(new Date());
        userInfo.setPassword("admin");
        userInfo.setIsDel(0);
        userInfo.setStatus(0);
        Long insert = userInfoMapper.insert(userInfo);
        System.out.println(insert.longValue());
    }


    @Test
    public void insertOrUpdate() {
        UserInfo userInfo = new UserInfo();
        userInfo.setUserId(22);
        // userInfo.setNickName("admin13");
        userInfo.setEmail("admin13");
        userInfo.setJoinTime(new Date());
        userInfo.setPassword("admin12223");
        userInfo.setIsDel(0);
        userInfo.setStatus(0);
        Long insert = userInfoMapper.insertOrUpdate(userInfo);
    }

    @Test
    public void insertBatch() {
        ArrayList<UserInfo> userInfoList = new ArrayList<>();
        UserInfo userInfo = new UserInfo();
        // userInfo.setUserId(22);
        userInfo.setNickName("admin15");
        userInfo.setEmail("admin15");
        userInfo.setJoinTime(new Date());
        userInfo.setPassword("admin12223");
        userInfo.setIsDel(0);
        userInfo.setStatus(0);
        userInfoList.add(userInfo);

        UserInfo userInfo2 = new UserInfo();
        // userInfo.setUserId(22);
        userInfo2.setNickName("admin16");
        userInfo2.setEmail("admin16");
        userInfo2.setJoinTime(new Date());
        userInfo2.setPassword("admin12223");
        userInfo2.setIsDel(0);
        userInfo2.setStatus(0);
        userInfoList.add(userInfo2);

        UserInfo userInfo3 = new UserInfo();
        // userInfo.setUserId(22);
        userInfo3.setNickName("admin19");
        userInfo3.setEmail("admin19");
        userInfo3.setJoinTime(new Date());
        userInfo3.setPassword("admin12223");
        userInfo3.setIsDel(0);
        userInfo3.setStatus(0);
        userInfoList.add(userInfo3);

        userInfoMapper.insertBatch(userInfoList);
    }

    @Test
    public void insertOrUpdateBatch() {
        ArrayList<UserInfo> userInfoList = new ArrayList<>();
        UserInfo userInfo = new UserInfo();
        // userInfo.setUserId(22);
        userInfo.setNickName("admin15");
        userInfo.setEmail("admin15");
        userInfo.setJoinTime(new Date());
        userInfo.setPassword("admin");
        userInfo.setIsDel(0);
        userInfo.setStatus(0);
        userInfoList.add(userInfo);

        UserInfo userInfo2 = new UserInfo();
        // userInfo.setUserId(22);
        userInfo2.setNickName("admin16");
        userInfo2.setEmail("admin16");
        userInfo2.setJoinTime(new Date());
        userInfo2.setPassword("admin");
        userInfo2.setIsDel(0);
        userInfo2.setStatus(0);
        userInfoList.add(userInfo2);

        UserInfo userInfo3 = new UserInfo();
        // userInfo.setUserId(22);
        userInfo3.setNickName("admin19");
        userInfo3.setEmail("admin19");
        userInfo3.setJoinTime(new Date());
        userInfo3.setPassword("admin");
        userInfo3.setIsDel(0);
        userInfo3.setStatus(0);
        userInfoList.add(userInfo3);

        userInfoMapper.insertOrUpdateBatch(userInfoList);
    }
    @Test
    public void selectByKey() {
        UserInfo userInfo = userInfoMapper.selectByUserId(9);
        System.out.println(userInfo.toString());
        UserInfo userInfo2 = userInfoMapper.selectByEmail("123");
        System.out.println(userInfo2.toString());
    }
    @Test
    public void updateByKey() {
        UserInfo userInfo = new UserInfo();
        // userInfo.setUserId(21);
        userInfo.setNickName("admin112");
        userInfo.setEmail("admin112");
        userInfo.setJoinTime(new Date());
        userInfo.setPassword("admin");
        userInfo.setIsDel(0);
        userInfo.setStatus(0);
        userInfoMapper.updateByUserId(userInfo, 32);
        // userInfoMapper.updateByEmail(userInfo, "admin19");
    }

    @Test
    public void  deleteByKey() {
        userInfoMapper.deleteByUserId(33);
        // userInfoMapper.deleteByQqOpenId("admin19");
        // userInfoMapper.deleteByNickName("admin16");
        // userInfoMapper.deleteByEmail("admin18");
    }
}
