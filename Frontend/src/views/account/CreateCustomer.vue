<template>
  <div id="register-page">
    <ProfileNavbar pageTitle="Create Customer" />
    <div class="container">
      <div class="row">
        <div class="col-4"></div>
        <div class="col-4">
          <div class="register-form panel">
            <div class="form-group">
              <label for="usr">ID:</label>
              <input type="text" v-model="customerId" class="form-control" id="usr">
            </div>
            <div class="form-group">
              <label for="usr">First Name:</label>
              <input type="text" v-model="firstName" class="form-control" id="usr">
            </div>
            <div class="form-group">
              <label for="usr">Last Name:</label>
              <input type="text" v-model="lastName" class="form-control" id="usr">
            </div>
            <div class="form-group">
              <label for="usr">Date of Birth:</label>
              <input type="text" v-model="dateOfBirth" class="form-control" id="usr">
            </div>
            <div class="form-group">
              <label for="usr">SSN:</label>
              <input type="text" v-model="ssn" class="form-control" id="usr">
            </div>
            <div class="form-group">
              <label for="usr">Address 1:</label>
              <input type="text" v-model="address1" class="form-control" id="usr">
            </div>
            <div class="form-group">
              <label for="usr">Address 2:</label>
              <input type="text" v-model="address2" class="form-control" id="usr">
            </div>
            <div class="form-group">
              <label for="pwd">City:</label>
              <input type="text" v-model="city" class="form-control" id="pwd">
            </div>
            <div class="form-group">
              <label for="usr">State:</label>
              <input type="text" v-model="state" class="form-control" id="usr">
            </div>
            <div class="form-group">
              <label for="usr">Zip-code:</label>
              <input type="text" v-model="zip" class="form-control" id="usr">
            </div>
            <div class="form-group">
              <label for="usr">Email:</label>
              <input type="text" v-model="email" class="form-control" id="usr">
            </div>
            <div class="form-group">
              <label for="usr">Phone Number:</label>
              <input type="text" v-model="phoneNumber" class="form-control" id="usr">
            </div>
            <div class="form-group">
              <label for="usr">Username:</label>
              <input type="text" v-model="userName" class="form-control" id="usr">
            </div>
            <div class="form-group">
              <label for="usr">Password:</label>
              <input type="password" v-model="password" class="form-control" id="usr">
            </div>
            <div class="form-group">
              <label for="pwd">Repeat Password:</label>
              <input type="password" class="form-control" id="pwd">
            </div>
            <button v-on:click="handleSubmit()">Register</button>
          </div>
        </div>
        <div class="col-4"></div>
      </div>
    </div>
  </div>
</template>

<script>
import Vue from 'vue';
import ProfileNavbar from '@/components/ProfileNavbar.vue';
import { userService } from '../../_services';
import router from '../../router';

export default {
  components: {
    ProfileNavbar,
  },
  data() {
    return {
      customerId:  '',
      firstName: '',
      lastName: '',
      dateOfBirth: '',
      ssn: '',
      address1: '',
      address2: '',
      city: '',
      state: '',
      zip: '',
      email: '',
      phoneNumber: '',
      userName: '',
      password: '',
      error: '',
      loading: '',
    };
  },
  created() {
  },
  methods: {
    handleSubmit(e) {
      this.submitted = true;
      this.loading = true;
      userService.createCustomer(
        this.customerId,
        this.firstName,
        this.lastName,
        this.dateOfBirth,
        this.ssn,
        this.address1,
        this.address2,
        this.city,
        this.state,
        this.zip,
        this.email,
        this.phoneNumber,
        this.userName,
        this.password)
        .then(
          (user) => router.push('/teller'),
        )
        .then(
          (error) => {
            this.error = error;
            this.loading = false;
            console.log(error);
          });
    },
  },
};
</script>

<style lang="scss">
#register-page {
  padding-top: 50px;
}

.register-form {
  padding-left: 10px;
  padding-right: 10px;
}
</style>

