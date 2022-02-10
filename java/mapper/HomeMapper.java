package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import vo.AboutImageVo;
import vo.HomeVo;

@Mapper
public interface HomeMapper {
	public List<HomeVo> HomeVideoList();
	public List<HomeVo> homeBannerVideoList();
	public String contactImage();
	public List<AboutImageVo> aboutImageList();
	public int aboutImageZoneHeight(); 
	public HomeVo videoDetail(String serial);
	public List<HomeVo> latestVideoList(String serial);
}
