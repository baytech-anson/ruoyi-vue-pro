package cn.iocoder.yudao.module.ai.controller.admin.chat;

import cn.iocoder.yudao.framework.common.pojo.CommonResult;
import cn.iocoder.yudao.module.ai.controller.admin.chat.vo.conversation.AiChatConversationCreateReqVO;
import cn.iocoder.yudao.module.ai.controller.admin.chat.vo.conversation.AiChatConversationListReqVO;
import cn.iocoder.yudao.module.ai.controller.admin.chat.vo.conversation.AiChatConversationRespVO;
import cn.iocoder.yudao.module.ai.controller.admin.chat.vo.conversation.AiChatConversationUpdateReqVO;
import cn.iocoder.yudao.module.ai.service.AiChatConversationService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static cn.iocoder.yudao.framework.common.pojo.CommonResult.success;

@Slf4j
@Tag(name = "管理后台 - 聊天会话")
@RestController
@RequestMapping("/ai/chat/conversation")
@AllArgsConstructor
public class AiChatConversationController {

    private final AiChatConversationService aiChatConversationService;

    // TODO done @fan：实现一下
    @PostMapping("/create")
    @Operation(summary = "创建聊天会话")
    @PreAuthorize("@ss.hasPermission('ai:chat-conversation:create')")
    public CommonResult<Long> createConversation(@RequestBody @Valid AiChatConversationCreateReqVO createReqVO) {
        return success(aiChatConversationService.createConversation(createReqVO));
    }

    // TODO done @fan：实现一下
    @PutMapping("/update")
    @Operation(summary = "更新聊天会话")
    @PreAuthorize("@ss.hasPermission('ai:chat-conversation:create')")
    public CommonResult<Boolean> updateConversation(@RequestBody @Valid AiChatConversationUpdateReqVO updateReqVO) {
        return success(aiChatConversationService.updateConversation(updateReqVO));
    }

    // TODO done @fan：实现一下
    @GetMapping("/list")
    @Operation(summary = "获得聊天会话列表")
    public CommonResult<List<AiChatConversationRespVO>> getConversationList(@ModelAttribute AiChatConversationListReqVO listReqVO) {
        return success(aiChatConversationService.listConversation(listReqVO));
    }

    // TODO @fan：实现一下
    @GetMapping("/get")
    @Operation(summary = "获得聊天会话")
    @Parameter(name = "id", required = true, description = "会话编号", example = "1024")
    public CommonResult<AiChatConversationRespVO> getConversation(@RequestParam("id") Long id) {
        return success(aiChatConversationService.getConversationOfValidate(id));
    }

    // TODO @fan：实现一下
    @DeleteMapping("/delete")
    @Operation(summary = "删除聊天会话")
    @Parameter(name = "id", required = true, description = "会话编号", example = "1024")
    public CommonResult<Boolean> deleteConversation(@RequestParam("id") Long id) {
        return success(aiChatConversationService.deleteConversation(id));
    }

}
