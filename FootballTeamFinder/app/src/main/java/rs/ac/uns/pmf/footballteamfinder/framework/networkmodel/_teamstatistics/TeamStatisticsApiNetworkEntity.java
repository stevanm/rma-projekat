package rs.ac.uns.pmf.footballteamfinder.framework.networkmodel._teamstatistics;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TeamStatisticsApiNetworkEntity {

	@SerializedName("response")
	private List<TeamStatisticsItemNetworkEntity> response;

	@SerializedName("get")
	private String get;

	@SerializedName("paging")
	private PagingNetworkEntity pagingNetworkEntity;

	@SerializedName("parameters")
	private ParametersNetworkEntity parametersNetworkEntity;

	@SerializedName("results")
	private int results;

	@SerializedName("errors")
	private List<Object> errors;

	public List<TeamStatisticsItemNetworkEntity> getResponse() {
		return response;
	}

	public String getGet() {
		return get;
	}

	public PagingNetworkEntity getPagingNetworkEntity() {
		return pagingNetworkEntity;
	}

	public ParametersNetworkEntity getParametersNetworkEntity() {
		return parametersNetworkEntity;
	}

	public int getResults() {
		return results;
	}

	public List<Object> getErrors() {
		return errors;
	}
}