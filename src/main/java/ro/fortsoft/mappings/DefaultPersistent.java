/*
 * Copyright (C) 2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ro.fortsoft.mappings;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * @author Daniel Jipa
 */
@MappedSuperclass
public abstract class DefaultPersistent extends DefaultLoggable implements
        Persistent {

    private static final long serialVersionUID = -6939142680842739719L;

    @Column(name = "ACTIVE")
    private Boolean active;

    @Column(name = "DELETED")
    private Boolean deleted;

    public DefaultPersistent() {
        super();
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(final Boolean active) {
        this.active = active;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(final Boolean deleted) {
        this.deleted = deleted;
    }

}
