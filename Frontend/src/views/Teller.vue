<template>
  <div class="profile">
    <ProfileNavbar pageTitle="Teller Overview"/>
    <div id="profile-container" class="container">
      <div class="row">
        <div class="col-4">
          <div id="balance-panel" class="container panel no-padding-margin">
            <a href="/teller/create-customer">Create Customer</a>
          </div>
        </div>
        <div class="col-8">
          <div id="transactions-panel" class="container panel" v-for="user in users" v-bind:key="user">
            <p>Name: {{user.firstName}} {{user.lastName}}</p>
            <p>Email: {{user.email}}</p>
            <p>
              Accounts: 3
              <button class="btn btn-primary float-right" v-on:click="handleSubmit(user)">Manage</button>
            </p>
          </div>
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
import router from '../router';

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
    const response = userService.getAll()
      .then((user) => {
        this.users = user;
      });
  },
  methods: {
    handleSubmit(user) {
      localStorage.setItem('chosenUser', JSON.stringify(user));
      router.push('/teller/manage-accounts');
    }
  }
};
</script>

<style lang="scss">
@import '@/scss/_palette.scss';
@import '@/scss/_settings.scss';

ul li {
  text-align: left !important; 
}

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
  text-align: left !important; 
}

.big-name {
  font-size: 26px !important;
  font-weight: bold;

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
