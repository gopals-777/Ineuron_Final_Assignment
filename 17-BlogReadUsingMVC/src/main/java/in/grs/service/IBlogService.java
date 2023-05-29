package in.grs.service;

import java.util.List;

import in.grs.model.BlogpostModel;

public interface IBlogService {
     public String saveBlog(BlogpostModel bp);
     public List<BlogpostModel> getAllBlogposts();
}
