package com.lzj.demo.controller;

import com.lzj.demo.entity.CardInHand;
import com.lzj.demo.service.CardInHandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author xcp
 * @version 1.0
 */
@RestController
@RequestMapping("/cardInHand")
public class CardInHandController {
    @Autowired
    private CardInHandService cardInHandService;
    @RequestMapping(value = "/listcardinhand", method = RequestMethod.GET)
    private Map<String,Object> listCardInHand(){
        Map<String,Object> modelMap = new HashMap<>();
        List<CardInHand> list = cardInHandService.queryCardInHand();
        modelMap.put("cardInHandList",list);
        return modelMap;
    }
    @RequestMapping(value = "/getcardinhandbyname",method = RequestMethod.GET)
    private Map<String,Object> getCardInHandByName(String UID,String cardName){
        Map<String,Object> modelMap = new HashMap<>();
        CardInHand cardInHand =cardInHandService.queryCardInHandByName(UID,cardName);
        modelMap.put("cardInHand",cardInHand);
        return modelMap;
    }
    @RequestMapping(value = "/insertcardinhand",method = RequestMethod.POST)
    private Map<String,Object> insertCardInHand(@RequestBody CardInHand cardInHand){
        Map<String,Object> modelMap = new HashMap<>();
        modelMap.put("success",cardInHandService.insertCardInHand(cardInHand));
        return modelMap;
    }
    @RequestMapping(value = "/updatecardinhand",method = RequestMethod.POST)
    private Map<String,Object> updateCardInHand(@RequestBody CardInHand cardInHand){
        Map<String,Object> modelMap = new HashMap<>();
        modelMap.put("success",cardInHandService.updateCardInHand(cardInHand));
        return modelMap;
    }
    @RequestMapping(value = "/deletecardinhand",method = RequestMethod.POST)
    private Map<String,Object> deleteCardInHand(@RequestBody CardInHand cardInHand){
        Map<String,Object> modelMap = new HashMap<>();
        modelMap.put("success",cardInHandService.deleteCardInHand(cardInHand));
        return modelMap;
    }
}
