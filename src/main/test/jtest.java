import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

import com.mongodb.client.MongoIterable;
import org.apache.log4j.*;
import org.junit.Before;
import org.junit.Test;


/**
 * @author wuyanzu
 * **
 * @Package PACKAGE_NAME
 * **
 * @Create with 2018/1/5 1:39
 * **
 * @Description: test
 */
public class jtest {

    public static Logger log= Logger.getLogger(jtest.class);
    private MongoDatabase db;
    private MongoClient client;
    private MongoCollection collection;

    @Before
    public void init(){
        System.out.println("init 初始化各种数据");
        client=new MongoClient("192.168.1.109");
        db=client.getDatabase("zzw");


    }

    @Test
    public  void test(){
        log.trace("trace级别的日志输出");
        log.info("info级别的日志输出");
        log.debug("debug级别的日志输出");
        log.warn("warn级别的日志输出");
        log.error("error级别的日志输出");
        log.fatal("fatal级别的日志输出");
        log.debug("debug级别的日志记录");
        MongoIterable<String> strings = db.listCollectionNames();
        MongoCursor<String> iterator = strings.iterator();
        while(iterator.hasNext()){
            System.out.println("----"+iterator.next());
        }
        System.out.println("do someThing...");
    }
}
