package vo;

public class HomeVo {
	
	public int serial;
	public int videoOrder;
	public String uploadDate;
	public String videoName;
	public String videoTitle;
	public String videoSmallTitle;
	public int bannerVideo;
	
	
	public String getVideoSmallTitle() {
		return videoSmallTitle;
	}
	public void setVideoSmallTitle(String videoSmallTitle) {
		this.videoSmallTitle = videoSmallTitle;
	}
	public int getBannerVideo() {
		return bannerVideo;
	}
	public void setBannerVideo(int bannerVideo) {
		this.bannerVideo = bannerVideo;
	}
	public String getVideoTitle() {
		return videoTitle;
	}
	public void setVideoTitle(String videoTitle) {
		this.videoTitle = videoTitle;
	}
	public String getVideoName() {
		return videoName;
	}
	public void setVideoName(String videoName) {
		this.videoName = videoName;
	}
	public int getSerial() {
		return serial;
	}
	public void setSerial(int serial) {
		this.serial = serial;
	}
	public int getVideoOrder() {
		return videoOrder;
	}
	public void setVideoOrder(int videoOrder) {
		this.videoOrder = videoOrder;
	}
	public String getUploadDate() {
		return uploadDate;
	}
	public void setUploadDate(String uploadDate) {
		this.uploadDate = uploadDate;
	}
}
