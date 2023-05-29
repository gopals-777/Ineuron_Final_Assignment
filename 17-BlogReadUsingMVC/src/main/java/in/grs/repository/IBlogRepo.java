package in.grs.repository;

import java.util.List;

import in.grs.model.BlogpostModel;

public interface IBlogRepo {
	 public String saveBlog(BlogpostModel bp);
     public List<BlogpostModel> getAllBlogposts();
}
