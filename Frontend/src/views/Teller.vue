<template>
  <div class="profile">
    <ProfileNavbar pageTitle="Account Overview"/>
    <div id="profile-container" class="container">
      <div class="row">
        <div class="col-4">
          <div id="balance-panel" class="container panel no-padding-margin">
            <Balance amount="865"/>
          </div>
        </div>
        <div class="col-8">
          <div id="transactions-panel" class="container panel">
            <Transactions/>
          </div>
          <ul>
            <li v-for="user in users">
              <div>{{user.firstName}} {{user.lastName}}</div>
            </li>
          </ul>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import ProfileNavbar from '@/components/ProfileNavbar.vue';
import Balance from '@/components/account/Balance.vue';
import Transactions from '@/components/account/Transactions.vue';
import { userService } from '../_services';

export default {
  name: 'account',
  components: {
    ProfileNavbar,
    Balance,
    Transactions,
  },
  data() {
    return {
      tellerName: '',
      users: [],
    };
  },
  created() {
    const response = userService.getAll();
    users = response;
  },
};
</script>

<style lang="scss">
@import '@/scss/_palette.scss';
@import '@/scss/_settings.scss';

#profile-container {
  padding-top: $main-content-top-padding;
  padding-bottom: $main-content-top-padding;
}

#activities-panel {
  height: 100%;
}

#avatar-panel {
  height: 592px;
  width: 100%;
}

#transactions-panel {
  border: 1px solid $palette-gainsboro !important;
  border-radius: 1px !important;
  background-color: $palette-white !important;
  margin-bottom: 0;
  padding-left: 0;
  padding-right: 0;
}

.panel {
  border: 1px solid $palette-gainsboro !important;
  border-radius: 1px !important;
  background-color: $palette-white !important;
  margin-bottom: $panel-vertical-margin;
}

.panel-padding {
  padding: $panel-text-padding !important;
  padding-left: 30 !important;
}

.no-padding-margin {
  padding: 0px !important;
  margin: 0px !important;
}
</style>
