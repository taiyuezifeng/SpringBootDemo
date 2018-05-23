package top.taiyuezifeng.springbootdemo;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;

/**
 * @类全限定名: top.taiyuezifeng.springbootdemo.FastjsonConfig
 * @创建日期: 2018-05-23
 * @创建人: taiyuezifeng
 * @版本号: 1.0.0
 * @描述: FastjsonConfig用于演示Spring Boot 整合Fastjson的配置管理。
 */
@Configuration
public class FastjsonConfig {

    /**
     * @Date：2018-05-23
     * @Author：taiyuezifeng
     * @Params：[]
     * @Return：org.springframework.boot.autoconfigure.web.HttpMessageConverters
     * @Description：fastJsonHttpMessageConverters用于
     */
    @Bean
    public HttpMessageConverters fastJsonHttpMessageConverters() {
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = new FastJsonHttpMessageConverter();

        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);

        fastJsonHttpMessageConverter.setFastJsonConfig(fastJsonConfig);

        HttpMessageConverter<?> converter = fastJsonHttpMessageConverter;

        return new HttpMessageConverters(converter);
    }

}
