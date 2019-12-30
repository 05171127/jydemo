import redis.clients.jedis.Jedis;


public class Test {
    //客户端1
    public static final  String requestId1 = "test1";
    //客户端2
    public static final  String requestId2 = "test2";

    @org.junit.Test
    public void test1(){
        Jedis jedis = new Jedis("192.168.5.13");
        try{
            Boolean flag = RedisTool.tryGetDistributedLock(jedis,"LOCK", requestId1,500000);
            System.out.println("获取锁:"+flag);
        }catch (Exception e){

        }
    }
    @org.junit.Test
    public void test2(){
        Jedis jedis = new Jedis("192.168.5.13");
        Boolean flag = RedisTool.tryGetDistributedLock(jedis,"LOCK", requestId1,500000);
        System.out.println("获取锁:"+flag);
    }

    @org.junit.Test
    public void test3(){
        Jedis jedis = new Jedis("192.168.5.13");
        jedis.set("hello","world");
    }

    @org.junit.Test
    public void test4(){
        Jedis jedis = new Jedis("192.168.5.13");
        Boolean flag =  RedisTool.releaseDistributedLock(jedis,"LOCK",requestId1);
        System.out.println("释放锁:"+flag);
    }

}
