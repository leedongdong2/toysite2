package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapper.HomeMapper;
import vo.AboutImageVo;
import vo.HomeVo;

@Service
public class HomeServiceImpl implements HomeService {
@Autowired
HomeMapper homeMapper;

@Override
public List<HomeVo> HomeVideoList() {
	List<HomeVo> list = homeMapper.HomeVideoList();
	return list;
}

@Override
public List<HomeVo> homeBannerVideoList() {
	List<HomeVo> bannerList = homeMapper.homeBannerVideoList();
	return bannerList;
}

@Override
public String contactImage() {
	String contactImage = homeMapper.contactImage();
	return contactImage;
}

@Override
public List<AboutImageVo> aboutImageList() {
	List<AboutImageVo> AboutImageList = homeMapper.aboutImageList(); 
	return AboutImageList;
}

@Override
public int aboutImageZoneHeight() {
	int aboutImageZoneHeight = homeMapper.aboutImageZoneHeight();
	return aboutImageZoneHeight;
}

@Override
public HomeVo videoDetail(String serial) {
	HomeVo videoDetail = homeMapper.videoDetail(serial);
	return videoDetail;
}

@Override
public List<HomeVo> latestVideoList(String serial) {
	List<HomeVo> latestVideoList = homeMapper.latestVideoList(serial);
	return latestVideoList;
}


}
