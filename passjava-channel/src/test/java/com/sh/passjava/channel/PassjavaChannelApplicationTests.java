package com.sh.passjava.channel;

import com.sh.passjava.channel.entity.ChannelEntity;
import com.sh.passjava.channel.service.ChannelService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class PassjavaChannelApplicationTests {

    @Autowired
    ChannelService channelService;

    @Test
    void contextLoads() {
    }

    @Test
    void testList() {
        List<ChannelEntity> list = channelService.list();
        System.out.println(list);
    }
}
