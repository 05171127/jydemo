/**
 *  @author: Ryan shipeipei
 *  @Date: 2019/12/17 15:55
 *  @Description: 8个人中选5个人 共有多少种选法
 */
public class Demo {
    public static void main(String[] args) {
        int text1 = 10,text2 = 5;
        int text3 = fun(text1)/fun(text1-text2)/fun(text2);
        System.out.println("在"+text1+"个人中选"+text2+"人共有"+text3+"种选法");
    }
    /*
    * n!/(n-r)!/r!
    * */
    static int fun(int n){
        if(n==1||n==0) {
            return n;
        }else{
            return n*fun(n-1);
        }
    }
}
