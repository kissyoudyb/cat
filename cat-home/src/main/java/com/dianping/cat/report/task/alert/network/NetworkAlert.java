package com.dianping.cat.report.task.alert.network;

import java.util.Map;

import org.unidal.lookup.annotation.Inject;

import com.dianping.cat.consumer.company.model.entity.ProductLine;
import com.dianping.cat.report.task.alert.AlertType;
import com.dianping.cat.report.task.alert.BaseAlert;
import com.dianping.cat.system.config.BaseRuleConfigManager;
import com.dianping.cat.system.config.NetworkRuleConfigManager;

public class NetworkAlert extends BaseAlert {

	@Inject
	protected NetworkRuleConfigManager m_ruleConfigManager;

	@Override
	public String getName() {
		return AlertType.Network.getName();
	}

	@Override
	protected Map<String, ProductLine> getProductlines() {
		return m_productLineConfigManager.queryNetworkProductLines();
	}

	@Override
	protected BaseRuleConfigManager getRuleConfigManager() {
		return m_ruleConfigManager;
	}

}