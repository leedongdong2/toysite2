package service;

import java.util.List;

import vo.AboutImageVo;
import vo.HomeVo;

public interface HomeService {
	public List<HomeVo> HomeVideoList();
	public List<HomeVo> homeBannerVideoList();
	public String contactImage();
	public List<AboutImageVo> aboutImageList();
	public int aboutImageZoneHeight(); 
	public HomeVo videoDetail(String serial);
	public List<HomeVo> latestVideoList(String serial);
}
