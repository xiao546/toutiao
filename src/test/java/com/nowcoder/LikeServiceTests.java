package com.nowcoder;


import com.nowcoder.service.LikeService;
import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by 546 on 2017/5/13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ToutiaoApplication.class)
public class LikeServiceTests {
    @Autowired
    LikeService likeService;

    @Test
    public void testLike(){
        likeService.like(123,1,1);
        Assert.assertEquals(1,likeService.getLikeStatus(123,1,1));
        System.out.println("testLike");
    }

    @Test
    public void testDislike(){
        likeService.disLike(123,1,1);
        Assert.assertEquals(-1,likeService.getLikeStatus(123,1,1));
        System.out.println("testLikeB");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testException(){
        throw new IllegalArgumentException("xxxx");
    }

    @Before
    public void setUp(){
        System.out.println("setUp");
    }

    @After
    public void testDown(){
        System.out.println("testDown");
    }

    @BeforeClass
    public static void beforeClass(){
        System.out.println("beforeClass");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("afterClass");
    }
}
