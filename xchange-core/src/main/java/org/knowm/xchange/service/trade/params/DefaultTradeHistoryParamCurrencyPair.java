package org.knowm.xchange.service.trade.params;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.knowm.xchange.currency.CurrencyPair;


@Builder
@Data
@Builder
@AllArgsConstructor
@Data
@NoArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
public class DefaultTradeHistoryParamCurrencyPair implements TradeHistoryParamCurrencyPair {

  private CurrencyPair currencyPair;

}
