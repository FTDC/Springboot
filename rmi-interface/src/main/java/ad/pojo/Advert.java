package ad.pojo;

import java.io.Serializable;

/**
 * 广告
 * 
 * @author mingsong.peng
 * @date 2018-01-11 14:42
 *
 */
public class Advert implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2501406851416765203L;
	private String advertId;
	private String name;
	private String icon;
	private int sort;
	private String imgUrl;
	private String linkUrl;
	private int enumValue;
	private String remark;

	public String getAdvertId() {
		return advertId;
	}

	public void setAdvertId(String advertId) {
		this.advertId = advertId;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public int getSort() {
		return sort;
	}

	public void setSort(int sort) {
		this.sort = sort;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getLinkUrl() {
		return linkUrl;
	}

	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}

	public int getEnumValue() {
		return enumValue;
	}

	public void setEnumValue(int enumValue) {
		this.enumValue = enumValue;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
