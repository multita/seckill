package org.seckill.exception;

/**
 * 关闭秒杀异常  spring只处理运行期异常
 */
public class RepeatKillException extends RuntimeException{

    public RepeatKillException(String message){
        super(message);
    }
    public RepeatKillException(String message,Throwable cause){
        super(message,cause);
    }
}
