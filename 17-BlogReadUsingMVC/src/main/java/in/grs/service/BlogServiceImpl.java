package in.grs.service;

import java.util.List;

import in.grs.model.BlogpostModel;
import in.grs.repository.BlogRepoImpl;
import in.grs.repository.IBlogRepo;

public class BlogServiceImpl implements IBlogService {

	IBlogRepo repo=new BlogRepoImpl();
	@Override
	public String saveBlog(BlogpostModel bp) {
		// TODO Auto-generated method stub
		return repo.saveBlog(bp);
	}

	@Override
	public List<BlogpostModel> getAllBlogposts() {
		// TODO Auto-generated method stub
		return repo.getAllBlogposts();
	}

}
