package com.rachit2525.annadaata.Callback;

import com.rachit2525.annadaata.Model.CommentModel;

import java.util.List;

public interface ICommentCallbackListener
{ void onCommentLoadSuccess(List<CommentModel> commentModels);
  void onCommentFailed(String message);
}
