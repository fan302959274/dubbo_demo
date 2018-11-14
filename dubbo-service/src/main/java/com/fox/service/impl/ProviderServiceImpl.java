package com.fox.service.impl;

import com.fox.mapper.TblComDicdtlMapper;
import com.fox.mapper.TblSecKillMapper;
import com.fox.model.TblComDicdtl;
import com.fox.model.TblComDicdtlExample;
import com.fox.model.TblSecKill;
import com.fox.service.ProviderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by sh00859 on 2018/4/10.
 */
@Service
public class ProviderServiceImpl implements ProviderService {
    private static ConcurrentHashMap map = new ConcurrentHashMap();
    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Resource
    KafkaTemplate kafkaTemplate;
    @Resource
    private TblSecKillMapper tblSecKillMapper;
    @Resource
    private TblComDicdtlMapper tblComDicdtlMapper;

    private volatile AtomicLong countVol = new AtomicLong(1);

    @Override
    public String queryDubboTestName(String name) {
//        kafkaTemplate.send("test", "test", "test");
//        kafkaTemplate.send("testKJ1", "testKJ1", "testKJ1");
        logger.info("进来了=====");
        return name;
    }

    @Override
    public Long increaseStock() {
        synchronized (this) {
            TblSecKill tblSecKill = tblSecKillMapper.selectByPrimaryKey(1L);
            Long count = tblSecKill.getCount() + 1;
            tblSecKill.setCount(count);
            tblSecKillMapper.updateByPrimaryKey(tblSecKill);
            logger.info("count:{};threadName:{}", count, Thread.currentThread().getName());
            return count;
        }

//        TblSecKill tblSecKill = tblSecKillMapper.selectByPrimaryKey(1L);
//        Long countVol = tblSecKill.getCount();
////        countVol.addAndGet(tblSecKill.getCount()) ;
//        countVol.addAndGet(tblSecKill.getCount());
//        tblSecKill.setCount(countVol.get());
//        tblSecKillMapper.updateByPrimaryKey(tblSecKill);
//        logger.info("count:{};threadName:{}", countVol, Thread.currentThread().getName());
//        return countVol;

    }

    @Override
    public String testTimeOut() {
//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        return "success";
    }

    @Override
    public Integer randomBalance() {

        TblComDicdtlExample example = new TblComDicdtlExample();
        example.createCriteria().andDataValueEqualTo("1");
        List<TblComDicdtl> dicdtlDtos = tblComDicdtlMapper.selectByExample(example);
        int totalLength = 0;
        for (TblComDicdtl dicdtlDto : dicdtlDtos) {
            totalLength += Integer.parseInt(dicdtlDto.getDataSubvalue());
        }
        if (totalLength > 0) {
            Random rand = new Random();
            int offset = rand.nextInt(totalLength);
            for (TblComDicdtl dicdtlDto : dicdtlDtos) {
                offset -= Integer.parseInt(dicdtlDto.getDataSubvalue());
                if (offset < 0) {
                    map.put(dicdtlDto.getPreDataValue(), Objects.isNull(map.get(dicdtlDto.getPreDataValue()))?1:(Integer.parseInt(map.get(dicdtlDto.getPreDataValue()).toString())+1));
                    Iterator it = map.entrySet().iterator();
                    StringBuffer sb = new StringBuffer();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        sb.append("key=" + key + " value=" + value+"|");
                    }
                    logger.info(sb.toString());
                    return Integer.parseInt(dicdtlDto.getPreDataValue());
                }
            }
        }
        return null;
    }
}
