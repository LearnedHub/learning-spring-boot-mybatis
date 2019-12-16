package cn.zhucogqi.learningspringbootmybatis.exception;

import com.alibaba.fastjson.JSON;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

/**
 * @author ：Jobsz
 * @project ：learning-spring-boot-mybatis
 * @date ：Created in 2019/12/16 13:54
 * @description：
 * @modified By：
 * @version:
 */
@RestControllerAdvice
public class CacheExceptionHandler {

    private class Error {
        private String ec;
        private String em;

        public String getEc() {
            return ec;
        }

        public void setEc(String ec) {
            this.ec = ec;
        }

        public String getEm() {
            return em;
        }

        public void setEm(String em) {
            this.em = em;
        }

        private Error(String ec, String em) {
            this.ec = ec;
            this.em = em;
        }

        @Override
        public String toString() {
            return JSON.toJSONString(this);
        }
    }

    @ExceptionHandler(NoHandlerFoundException.class)
    public String handlerNotFoundException(Exception e) {
        return new Error("404", "Not Found").toString();
    }

    @ExceptionHandler(Exception.class)
    public String handlerNException(Exception e) {
        return new Error("500", "Server Error").toString();
    }
}
