/* DO NOT EDIT */
/* This file was generated from shared_links.stone */

package com.dropbox.core.v2.sharing;

import com.dropbox.core.DbxException;

/**
 * The request builder returned by {@link
 * DbxUserSharingRequests#getSharedLinkMetadataBuilder(String)}.
 *
 * <p> Use this class to set optional request parameters and complete the
 * request. </p>
 */
public class GetSharedLinkMetadataBuilder {
    private final DbxUserSharingRequests sharing_;
    private final GetSharedLinkMetadataArg.Builder getSharedLinkMetadataArgBuilder;

    /**
     * Creates a new instance of this builder.
     *
     * @param sharing_  Dropbox namespace-specific client used to issue sharing
     *     requests.
     * @param getSharedLinkMetadataArgBuilder  Request argument builder.
     *
     * @return instsance of this builder
     */
    GetSharedLinkMetadataBuilder(DbxUserSharingRequests sharing_, GetSharedLinkMetadataArg.Builder getSharedLinkMetadataArgBuilder) {
        if (sharing_ == null) {
            throw new NullPointerException("sharing_");
        }
        this.sharing_ = sharing_;
        if (getSharedLinkMetadataArgBuilder == null) {
            throw new NullPointerException("getSharedLinkMetadataArgBuilder");
        }
        this.getSharedLinkMetadataArgBuilder = getSharedLinkMetadataArgBuilder;
    }

    /**
     * Set value for optional field.
     *
     * @param path  If the shared link is to a folder, this parameter can be
     *     used to retrieve the metadata for a specific file or sub-folder in
     *     this folder. A relative path should be used. Must match pattern
     *     "{@code /(.|[\\r\\n])*}".
     *
     * @return this builder
     *
     * @throws IllegalArgumentException  If any argument does not meet its
     *     preconditions.
     */
    public GetSharedLinkMetadataBuilder withPath(String path) {
        this.getSharedLinkMetadataArgBuilder.withPath(path);
        return this;
    }

    /**
     * Set value for optional field.
     *
     * @param linkPassword  If the shared link has a password, this parameter
     *     can be used.
     *
     * @return this builder
     */
    public GetSharedLinkMetadataBuilder withLinkPassword(String linkPassword) {
        this.getSharedLinkMetadataArgBuilder.withLinkPassword(linkPassword);
        return this;
    }

    /**
     * Issues the request.
     */
    public SharedLinkMetadata start() throws SharedLinkErrorException, DbxException {
        GetSharedLinkMetadataArg arg_ = this.getSharedLinkMetadataArgBuilder.build();
        return sharing_.getSharedLinkMetadata(arg_);
    }
}
