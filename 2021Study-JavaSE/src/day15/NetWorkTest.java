package day15;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: day15
 * @Author: Dong Binyu
 * @CreateTime: 2021-04-22 16:11
 * @Description:
 */
public class NetWorkTest{
    public static void main(String[] args) {
        ProxyServer proxyServer = new ProxyServer ( new Server () );
        proxyServer.browse ();
    }
}
 interface NetWork {
    public void browse();
}
class Server implements NetWork{
    @Override
    public void browse() {
        System.out.println ("真实的服务器访问网络");
    }
}
class ProxyServer implements NetWork{
    private NetWork work;
    public ProxyServer(NetWork work){
        this.work=work;
    }
    public void check(){
        System.out.println ("联网之前的检查工作");
    }
    @Override
    public void browse() {
        check ();
        work.browse ();
    }
}

