package day16.exer;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: day16.exer
 * @Author: Dong Binyu
 * @CreateTime: 2021-04-25 17:38
 * @Description:
 */
public class EcmDef {
    public static void main(String[] args) {
        try {
            int i=Integer.parseInt ( args[0] );
            int j=Integer.parseInt ( args[1] );
            int result= ecm ( i, j );
            System.out.println (result);
        } catch (NumberFormatException nfe) {
            System.out.println ("数据类型不一致");
        }catch (ArrayIndexOutOfBoundsException aioobe){
            System.out.println ("缺少命令行参数");
        }catch(ArithmeticException ae){
            System.out.println ("除0异常");
        }catch(EcDef ed){
            System.out.println (ed.getMessage ());
        }

    }
    public static int ecm(int i,int j) throws EcDef {
        if(i<0||j<0){
            throw new EcDef ( "分子或分母为负数" );
        }
        return i/j;
    }
}
