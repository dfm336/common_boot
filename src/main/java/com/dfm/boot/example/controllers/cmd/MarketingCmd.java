package com.dfm.boot.example.controllers.cmd;

import lombok.Data;

import java.util.Date;

/**
 * @author daifengming
 */
@Data
public class MarketingCmd {
      /**
       * 营销时间
       */
      private Date marketingTime;
      /**
       * 营销状态
       */
      private Integer marketingStatus;
      /**
       * 描述
       */
      private String desc;
}
