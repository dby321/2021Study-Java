import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * @BelongsProject: 2020Study-JavaWeb
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Dong Binyu
 * @CreateTime: 2020-09-24 11:54
 * @Description:
 */
@WebListener
public class onLineCount implements HttpSessionListener {

    public int count=0;//记录session的数量
    @Override
    public void sessionCreated(HttpSessionEvent arg0) {//监听session的创建
        count++;
        arg0.getSession().getServletContext().setAttribute("Count", count);

    }

    @Override
    public void sessionDestroyed(HttpSessionEvent arg0) {//监听session的撤销
        count--;
        arg0.getSession().getServletContext().setAttribute("Count", count);
    }

}