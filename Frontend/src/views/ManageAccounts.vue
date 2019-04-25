<template>
  <div class="profile">
    <ProfileNavbar pageTitle="Account Overview"/>
    <div id="profile-container" class="container">
      <div class="row">
        <div class="col-4">
          <div id="balance-panel" class="container panel no-padding-margin">
            <div id="account-balance">
            <ul class="list-group list-group-flush">
              <li class="list-group-heading">
                <h3>{{ user.firstName }} {{ user.lastName }}</h3>
              </li>
              <li class="list-group-item">ID: {{ user.id }}</li>
              <li class="list-group-item">Username: {{ user.username }}</li>
              <li class="list-group-item">Email: {{ user.email }}</li>
              <li class="list-group-item">Phone Number:{{ user.phoneNumber }}</li>
              <li class="list-group-item">Birthdate: {{ user.dateOfBirth }}</li>
              <li class="list-group-item">SSN: {{ user.ssn }}</li>
              <li class="list-group-item">Address 1: {{ user.address1 }}</li>
              <li class="list-group-item">Address 1: {{ user.address2 }}</li>
              <li class="list-group-item">City: {{ user.city }}</li>
              <li class="list-group-item">State: {{ user.state }}</li>
              <li class="list-group-item">Zipcode: {{ user.zip }}</li>
            </ul>
          </div>
          </div>
        </div>
        <div class="col-8">
          <div id="transactions-panel" class="container panel">
            <ul class="list-group list-group-flush">
              <li class="list-group-heading">
                <h3>Accounts</h3>
              </li>
              <li class="list-group-item" v-for="account in accounts" v-bind:key="account">
                Account #: {{ account.accountNumber }}
                <p>Balance: ${{ account.balance }}<button class="btn btn-primary float-right">Manage</button></p>
              </li>
            </ul>
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
      user: '',
      accounts: [
        { accountNumber: 12951, balance: 11239 },
        { accountNumber: 53362, balance: 143 },
        { accountNumber: 56789, balance: 1235 },
      ]
    };
  },
  created() {
    let chosenUser = JSON.parse(localStorage.getItem('chosenUser'));
    console.log(chosenUser);
    this.user = chosenUser;
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
